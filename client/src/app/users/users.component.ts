import { Component, OnInit } from '@angular/core';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private usersService: UsersService) { }

  ngOnInit(): void {
    this.getUsers();
  }

  users;
  getUsers() {
    this.usersService.getUsers()
      .subscribe(data => {
        console.log(data);
        this.users = data;
      })
    console.log("testing");
  }

}
