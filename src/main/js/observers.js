import React from "react";

export class Observers extends React.Component {
    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        let observers = this.props.observers.map((obs) =>
            <Observer name={obs.name} phone={obs.phone}/>)
        return (
            <>
                <h1>Наблюдатели</h1>
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Phone</th>
                    </tr>
                    {observers}
                </table>
            </>
        )
    }
}

class Observer extends React.Component{
    constructor(props) {
        super(props);
    }
    render() {
        return(
        <tr>
            <td>{this.props.name}</td><td>{this.props.phone}</td>
        </tr>
        )
    }
}