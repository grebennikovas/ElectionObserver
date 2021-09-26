// npm run-script watch

'use strict';
const React = require('react');
const ReactDOM = require('react-dom');
import { Observers } from './observers';


class App extends React.Component {

    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        return (
            <Observers/>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)