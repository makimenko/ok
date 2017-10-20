import { Component, OnInit } from '@angular/core';
import { DefaultApi, Profile } from "../../typescript-angular2-client"

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  title = `App works !`;
  profileList : Profile[];

  constructor(
    public defaultApi:DefaultApi
  ) { }

  ngOnInit() {
    this.defaultApi.getAllProfiles().subscribe(data=>{this.profileList = data})
  }

}
