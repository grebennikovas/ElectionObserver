import * as React from 'react';
import {
    createTheme,
    responsiveFontSizes,
    ThemeProvider,
} from '@mui/material/styles';
import Typography from "@mui/material/Typography";
import CssBaseline from '@mui/material/CssBaseline';
import Box from "@mui/material/Box";

require('typeface-montserrat');

let theme = createTheme({
    typography: {
        h2: {
            fontSize: '1.5 rem',
            fontWeight: 400,
            lineHeight: 1.5,
        },
        fontFamily: 'Montserrat'
    },
    body: {
        fontFamily: "Montserrat"
    }
});
theme = responsiveFontSizes(theme);

export class IndexPage extends React.Component {

    constructor(props) {
        super(props);
    }

    componentDidMount() {
    }

    render() {
        return (
            <ThemeProvider theme={theme}>
                <CssBaseline/>
                <Box sx={{
                    fontFamily: 'Montserrat',
                }}>
                    <Typography component="div" gutterBottom variant="h2" >
                        Blog
                    </Typography>
                </Box>
            </ThemeProvider>
        )
    }
}