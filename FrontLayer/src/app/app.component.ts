import {Component} from '@angular/core';
import {HttpClient} from '@angular/common/http';

interface Massage {
  content: string;
  author: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FrontLayer';
  time = 'beforeTime';
  messages = Array<Massage>();

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
    this.http.get('/api/time', {responseType: 'text'}).subscribe(
      data => {
        this.time = data;
      });
  }
}

