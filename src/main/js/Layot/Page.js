import * as React from 'react';
import {BrowserRouter, Link, Route, Switch} from "react-router-dom";
import {ObserversPage} from "../Pages/Observers";
import {IndexPage} from "../Pages/IndexPage";

export class Page extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            loaded: false
        }
    }

    componentDidMount() {
    }

    render(){
        return (
            <BrowserRouter>
                <div>
                    <nav>
                        <ul>
                            <li>
                                <Link to="/">Home</Link>
                            </li>
                            <li>
                                <Link to="/about">About</Link>
                            </li>
                            <li>
                                <Link to="/observers">Users</Link>
                            </li>
                        </ul>
                    </nav>
                    <Switch>
                        <Route path="/about">
                            <h1>О нас</h1>
                        </Route>
                        <Route path="/observers">
                            <ObserversPage />
                        </Route>
                        <Route path="/">
                            <IndexPage />
                        </Route>
                    </Switch>
                </div>
            </BrowserRouter>
        )
    }
}