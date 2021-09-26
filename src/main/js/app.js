// npm run-script watch

'use strict';
const React = require('react');
const ReactDOM = require('react-dom');
import { Observers } from './observers';
import Button from '@mui/material/Button';
import { DataGrid } from '@mui/x-data-grid';

class App extends React.Component {

    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        const columns = [
            { field: 'id', headerName: 'ID', width: 90 },
            { field: 'name', headerName: 'Имя', width: 150, editable: true },
            { field: 'phone', headerName: 'Телефон', width: 150, editable: true }]
        let test_data = [{id: 1,name: "First_name",phone: "8914"},{id: 2,name: "Second_name",phone: "8914"}];
        return (
            <>
                <Button>Hello World</Button>
                <Observers observers={test_data}/>
                <div style={{ height: 400, width: '100%' }}>
                <DataGrid
                    rows={test_data}
                    columns={columns}
                    pageSize={5}
                    rowsPerPageOptions={[5]}
                    checkboxSelection
                    disableSelectionOnClick
                />
                </div>
            </>

        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)