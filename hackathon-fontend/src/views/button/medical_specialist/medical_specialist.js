import React from "react";
import './medical_specialist.scss';
import Medical from "./medical";
import medical1 from '../../../assets/images/medical1.png'

class MedicalSpecialist extends React.Component{

    render(){
        return(
            <div className="medical-specialist">
                <h1 style={{ color: "#1B3C74" }}>Our Medical Specialist</h1>
                <div className="slider-medical">
                    <Medical
                    url = {medical1}
                    name = {"Dr. Heena Sachdeva"}
                    information = {"Khoa sản"}
                    />
                    <Medical
                    url = {medical1}
                    name = {"Dr. Heena Sachdeva"}
                    information = {"Khoa sản"}
                    />
                    <Medical
                    url = {medical1}
                    name = {"Dr. Heena Sachdeva"}
                    information = {"Khoa sản"}
                    />
                    <Medical
                    url = {medical1}
                    name = {"Dr. Heena Sachdeva"}
                    information = {"Khoa sản"}
                    />
                </div>
                <div className="slider-btn">
                    <div className="btn "></div>
                    <div className="btn active"></div>
                    <div className="btn "></div>
                </div>
            </div>
        )
    }

}

export default MedicalSpecialist


