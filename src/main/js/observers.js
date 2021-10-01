import React from "react";
import DataGrid from 'react-data-grid'

export class Observers extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            error: null,
            isLoaded: false,
            observers: []
        }
    }

    componentDidMount() {
        fetch("http://localhost:8080/api/observer")
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        isLoaded: true,
                        observers: result.data
                    });
                },
                (error) => {
                    this.setState({
                        isLoaded: true,
                        error
                    });
                }
            )
    }

    render() {
        const columns = [
            { key: 'id', name: 'ID', resizable: true, width: 10 },
            { key: 'l_name', name: 'Фамилия', resizable: true, width: 200},
            { key: 'f_name', name: 'Имя', resizable: true, width: 150},
            { key: 'm_name', name: 'Отчество', resizable: true, width: 150},
            { key: 'phone', name: 'Телефон', resizable: false, width: "auto"}]
        if (this.state.isLoaded)
        return(
            <div style={{ width: '800px' }}>
                <h1>Наблюдатели</h1>
                <DataGrid
                    rows={this.state.observers}
                    columns={columns}
                    style={{ height: "100%", contain: "none",borderBottom:"0",borderRight:"0"}}
                    headerRowHeight={40}
                />
            </div>
        )
        else
            return <div style={{ width: 'auto' }}>
                <h1>Загрузка</h1>
            </div>
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