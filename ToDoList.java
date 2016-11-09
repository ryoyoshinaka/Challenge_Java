package utsystem2;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<ToDo> todoList = new ArrayList<ToDo>();
	public void add(ToDo todo){

		if(!todoList.contains(todo)){	//穴埋め
			todoList.add(new ToDo(todo));
		}
	}
	public void update(ToDo todo){
		int index = todoList.indexOf(todo);
		if(index != -1){	//穴埋め
			todoList.set(index, todo);
		}
	}
	public List<ToDo> select(Condition... conditions){
		List<ToDo> result = new ArrayList<ToDo>();
		for(ToDo todo : todoList){
//			System.out.println(todoList);
//			System.out.println(" ");
			boolean selected = true;
			for(Condition condition : conditions){
				selected = condition.test(todo);
				if(!selected)break;
			}
			if(selected){
				result.add(new ToDo(todo));
				System.out.println(todo);
				System.out.println(" ");
			}
		}
		return result;
	}
}