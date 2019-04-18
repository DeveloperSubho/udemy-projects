import { Component, OnInit } from '@angular/core';
import {Task} from "../task.model";
import {TaskService} from "../task.service";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css'],
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  ngOnInit() {
      this.taskService.getTasks()
          .subscribe(
              (tasks: any[]) => {
                  this.tasks = tasks;
              }
          );
      this.taskService.onTaskAdded.subscribe(
          (task: Task) => this.tasks.push(task)
      );



  }

    onTaskChange(event, task){
        return this.taskService.saveTask(task,event.target.checked).subscribe();
        //console.log("Task has changed");
    }
    getDueDateLabel(task: Task){
        return task.completed ? 'badge badge-success':'badge badge-primary';

    }

}
