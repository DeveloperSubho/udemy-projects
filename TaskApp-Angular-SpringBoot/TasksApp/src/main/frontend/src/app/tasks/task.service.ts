import {Injectable, EventEmitter} from '@angular/core';
import {Task} from "./task.model";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class TaskService{

    taskSelected = new EventEmitter<Task>();
    onTaskAdded = new EventEmitter<Task>();

    constructor(private http: HttpClient){

    }

    getTasks(){
        return this.http.get('/api/tasks');
        //.map(response => response.json());
    }

    saveTask(task: Task, checked: boolean){
        task.completed = checked;
        return this.http.put('/api/tasks/save',task);
    }

    addTask(task: Task){
        return this.http.post('/api/tasks/save',task);
    }
}
