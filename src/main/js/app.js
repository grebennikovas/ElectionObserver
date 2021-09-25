'use strict';
const React = require('react');
const ReactDOM = require('react-dom');
//const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        return (
            "YES RIGHT"
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)