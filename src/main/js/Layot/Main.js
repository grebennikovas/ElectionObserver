import MainMenu from "./MainMenu";
import MainRouter from "./MainRouter"
import Box from '@mui/material/Box';
import Drawer from '@mui/material/Drawer';
import AppBar from '@mui/material/AppBar';
import CssBaseline from '@mui/material/CssBaseline';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import {BrowserRouter, Route, Switch} from "react-router-dom";
import {ObserversPage} from "../Pages/Observers";
import {IndexPage} from "../Pages/IndexPage";

const React = require('react');

const drawerWidth = 240;

export class MainLayot extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            open : false
        }
    }

    componentDidMount() {
    }

    render() {
        return (
            <Box sx={{ display: 'flex' }}>
                <CssBaseline />
                <AppBar position="fixed" sx={{ zIndex: (theme) => theme.zIndex.drawer + 1 }}>
                    <Toolbar>
                        <Typography variant="h6" noWrap component="div">
                            Информационная система для диплома
                        </Typography>
                    </Toolbar>
                </AppBar>
                <BrowserRouter>
                <Drawer
                    variant="permanent"
                    sx={{
                        width: drawerWidth,
                        flexShrink: 0,
                        [`& .MuiDrawer-paper`]: { width: drawerWidth, boxSizing: 'border-box' },
                    }}
                >
                    <Toolbar />
                    <Box sx={{ overflow: 'auto' /* действия при переполнении */}}>
                        <MainMenu/>
                    </Box>
                </Drawer>
                <Box component="main" sx={{ flexGrow: 1, p: 2}}>
                    <Toolbar />
                    <MainRouter />
                </Box>
                </BrowserRouter>
            </Box>
        )
    }


}