import * as React from 'react';
import {BrowserRouter, Link, Route, Switch} from "react-router-dom";
import {ObserversPage} from "../Pages/Observers";
import {IndexPage} from "../Pages/IndexPage";
import Typography from "@mui/material/Typography";

export default function MainRouter(){
    return (
        <div>
            <Switch>
                <Route exact path="/about">
                    <Typography variant="h1" component="div" gutterBottom>
                        О нас
                    </Typography>
                </Route>
                <Route exact path="/observers">
                    <ObserversPage />
                </Route>
                <Route exact path="/">
                    <IndexPage />
                </Route>
                <Route>
                    <h1>404 - Странца не найдена</h1>
                </Route>
            </Switch>
        </div>
    )

}