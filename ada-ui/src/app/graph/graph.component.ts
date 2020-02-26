import { Component, OnInit } from '@angular/core';
import {AnalyserService} from "../analyser.service";
import {tap} from "rxjs/operators";
import { sigma } from 'sigma';
import {element} from "protractor";

@Component({
  selector: 'app-graph',
  templateUrl: './graph.component.html',
  styleUrls: ['./graph.component.css']
})
export class GraphComponent implements OnInit {

  private graphData: any;

  constructor(private analyserService: AnalyserService) { }

  ngOnInit() {
    this.analyserService.getAnalysis()
      .pipe(
        tap(_ => console.log('tapped'))
      ).subscribe(data => this.populateGraph(data));
  }

  populateGraph(data: any) : void {
    this.graphData = data;

    // Let's first initialize sigma:
    var s = new sigma('sigma-container');

    // Then, let's add some data to display:
    let i = 0;
    for ( let element in this.graphData.classStructures) {
      console.log(element);
      let lastIndex = element.lastIndexOf('.');
      let className = (lastIndex > 0 ? element.substr(lastIndex + 1, element.length - 1) : element);

      s.graph.addNode({
        id: element,
        label: className,
        x: i,
        y: i++,
        size: 1,
        color: '#foo'
      })
    }
    // s.addEdge({
    //   id: 'e0',
    //   Reference extremities:
      // source: 'n0',
      // target: 'n1'
    // });

    // Finally, let's ask our sigma instance to refresh:
    s.refresh();// Let's first initialize sigma:

  }

}
