import React from "react";
import { DataGrid } from '@mui/x-data-grid';
import getData from './Functions'

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
            { field: 'id', headerName: 'ID', minWidth: 10,flex: 0.2 },
            { field: 'l_name', headerName: 'Фамилия', minWidth: 50,flex: 0.2, editable: true },
            { field: 'f_name', headerName: 'Имя', minWidth: 50,flex: 0.2, editable: true },
            { field: 'm_name', headerName: 'Отчество', minWidth: 50,flex: 0.2, editable: true },
            { field: 'phone', headerName: 'Телефон', minWidth: 50,flex: 0.2, editable: true }]
        if (this.state.isLoaded)
        return(
            <div style={{ height: 400, width: 'auto' }}>
                <h1>Наблюдатели</h1>
                <DataGrid
                    rows={this.state.observers}
                    columns={columns}
                />
            </div>
        )
        else
            return <div style={{ height: 400, width: 'auto' }}>
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