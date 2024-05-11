import React from "react";
import './header.scss';
import {NavLink} from 'react-router-dom';
import HeaderButton from "../button/header_button/button";
import tiktok from '../../assets/images/tiktok.png'
import facebook from '../../assets/images/facebook.png'
import instagram from '../../assets/images/instagram.png'
import zalo from '../../assets/images/zalo.png'
import english from '../../assets/images/english.png'

class Header extends React.Component{
    
    render(){
        return(
            <div className="header">
                <div className="logo"></div>
                <div className="header-content">
                    <div className="header-top">
                        <div className="left">
                           <HeaderButton
                                url = {tiktok}
                                width = {42}
                                height = {42}
                            />
                            <div class="vertical-line"></div>
                            <HeaderButton
                                url = {facebook}
                                width = {35}
                                height = {35}
                            />
                            <div class="vertical-line"></div>
                            <HeaderButton
                                url = {instagram}
                                width = {35}
                                height = {35}
                            />
                            <div class="vertical-line"></div>
                            <HeaderButton
                                url = {zalo}
                                width = {33}
                                height = {30}
                            />
                        </div>
                        <div className="right">
                            <HeaderButton
                                url = {english}
                                width = {55}
                                height = {36}
                            />
                            <div className="language-icon"></div>
                        </div>
                    </div>
                    <div class="horital-line"></div>
                    <div className="nav">
                        <div className="nav-link">
                            <NavLink to="/" activeclassname = 'active'>Home</NavLink>
                            <NavLink to="/todo" activeclassname = 'active'>News</NavLink>
                            <NavLink to="/about" activeclassname = 'active'>Profile</NavLink>
                            <NavLink to="/users" activeclassname = 'active' className="btn-logout">Logout</NavLink>
                        </div>
                    </div>
                </div>
            </div>
        )
    }

}

export default Header


