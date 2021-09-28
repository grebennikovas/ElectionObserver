// npm run-script watch
'use strict';
const React = require('react');
const ReactDOM = require('react-dom');
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";
import { MainLayot } from './Layot/Main';


export class App extends React.Component {

    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        return (
            <MainLayot/>
        )
    }
}
