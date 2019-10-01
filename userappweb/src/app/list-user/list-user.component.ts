import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { User } from '../shared/user';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {

  private listUser : User[] = [];
  
  constructor(private userService: UserService ) { }

  ngOnInit() {
    this.getAllUser();
  }

  public getAllUser(){
    this.userService.getAllUser().subscribe(
      data => {
        console.log(data);
        this.listUser = data; 
      }
    )
  }

}
