import * as React from 'react';
import ListSubheader from '@mui/material/ListSubheader';
import List from '@mui/material/List';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import Collapse from '@mui/material/Collapse';
import InboxIcon from '@mui/icons-material/MoveToInbox';
import DraftsIcon from '@mui/icons-material/Drafts';
import SendIcon from '@mui/icons-material/Send';
import ExpandLess from '@mui/icons-material/ExpandLess';
import ExpandMore from '@mui/icons-material/ExpandMore';
import StarBorder from '@mui/icons-material/StarBorder';
import ListItem from "@mui/material/ListItem";
import MailIcon from "@mui/icons-material/Mail";
import Divider from "@mui/material/Divider";
import {Link as RouterLink, BrowserRouter, Route, Switch} from "react-router-dom"
import {ObserversPage} from "../Pages/Observers";
import {IndexPage} from "../Pages/IndexPage";

export default function MainMenu() {
    const [open, setOpen] = React.useState(true);

    const handleClick = () => {
        setOpen(!open);
    };

    return (
        <>
            <List>
                <ListItemLink to="/" primary="Главная" icon={<InboxIcon />} />
                <ListItemLink to="/observers" primary="Наблюдатели" icon={<InboxIcon />} />
            </List>
            <Divider/>
            <List
                sx={{ width: '100%', maxWidth: 360, bgcolor: 'background.paper' }}
                component="nav"
            >
                <ListItemButton onClick={handleClick}>
                    <ListItemIcon>
                        <InboxIcon />
                    </ListItemIcon>
                    <ListItemText primary="Справочники" />
                    {open ? <ExpandLess /> : <ExpandMore />}
                </ListItemButton>
                <Collapse in={open} timeout="auto" unmountOnExit>
                    <List component="div" disablePadding>
                        <ListItemLink to="/" primary="Участки" icon={<InboxIcon />} />
                        <ListItemLink to="/" primary="Кампании" icon={<InboxIcon />} />
                        <ListItemLink to="/" primary="Регионы" icon={<InboxIcon />} />
                    </List>
                </Collapse>
            </List>
        </>
    );
}

function ListItemLink(props) {
    const { icon, primary, to } = props;

    const renderLink = React.useMemo(
        () =>
            React.forwardRef(function Link(itemProps, ref) {
                return <RouterLink to={to} ref={ref} {...itemProps} role={undefined} />;
            }),
        [to],
    );

    return (
        <li>
            <ListItem button component={renderLink}>
                {icon ? <ListItemIcon>{icon}</ListItemIcon> : null}
                {}
                <ListItemText primary={primary} />
            </ListItem>
        </li>
    );
}