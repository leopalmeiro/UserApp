import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../shared/user';
import { apiAddressUser } from '../config/app-settings.config';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }


  public getAllUser(): Observable<User[]> {
    let fullUrl = environment.apiUrl + apiAddressUser.user + apiAddressUser.listuser;
    console.log(fullUrl);
    return this.httpClient.get<User[]>(fullUrl); 

  }
}