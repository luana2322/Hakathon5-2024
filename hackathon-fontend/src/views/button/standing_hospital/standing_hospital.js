import React from "react";
import './standing_hospital.scss';
import Hospital from "./hospital";
import hospital from '../../../assets/images/hospital.png'

class StandingHospital extends React.Component{

    render(){
        return(
            <div className="standing-hospital">
                <h1>Outstanding hospital</h1>
                <div className="slider-hospital">
                    <Hospital
                    url = {hospital}
                    name = {"ABCDEF"}
                    information = {"abcdeefghnsfsdsdasdfsdaabcdeefghnsfsdsdasdfsdaabcdeefghnsfsdsdasdfsda"}
                    />
                    <Hospital
                    url = {hospital}
                    name = {"ABCDEF"}
                    information = {"abcdeefghnsfsdsdasdfsdaabcdeefghnsfsdsdasdfsdaabcdeefghnsfsdsdasdfsda"}
                    />
                    <Hospital
                    url = {hospital}
                    name = {"ABCDEF"}
                    information = {"abcdeefghnsfsdsdasdfsdaabcdeefghnsfsdsdasdfsdaabcdeefghnsfsdsdasdfsda"}
                    />
                </div>
            </div>
        )
    }

}

export default StandingHospital


