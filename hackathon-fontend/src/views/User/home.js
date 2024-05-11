import React from "react";
import './home.scss';
import { redirect } from 'react-router-dom';
import LargeButton from "../button/large_button/large_button";
import medicine_chest from '../../assets/images/medicine-chest.png'
import doctor from '../../assets/images/doctor.png'
import hopital from '../../assets/images/hopital.png'
import more from '../../assets/images/more.png'
import pills from '../../assets/images/pills.png'
import stethoscope from '../../assets/images/stethoscope.png'
import temperature from '../../assets/images/temperature.png'
import xelan from '../../assets/images/xelan.png'
import StandingHospital from "../button/standing_hospital/standing_hospital";
import MedicalSpecialist from "../button/medical_specialist/medical_specialist";
import LatestnNews from "../button/latest_news/latest_news";
import Question from "../button/question/question";

class Home extends React.Component{

    componentDidMount(){
        redirect('/')
    }

    render(){
        return (
            <div className="home">
                <div className="top">
                    <div className="banner">
                        <div className="slider">
                            <div className="slider-content">
                                <div className="content">
                                    <div className="text1">
                                        <h1 className="t1">Doctor</h1>
                                        <h1 className="t2">Consultation</h1>
                                    </div>
                                    <div className="text2">"The new era of healthcare: Online consultation is revolutionizing how we access healthcare."</div>
                                    <div className="button">Make an appointment</div>
                                    <div className="text3">Connect instantly with a 24x7 specialist or choose to video visit a particular doctor.</div>
                                </div>
                                <div className="slider-img"></div>
                            </div>
                            <div className="slider-btn">
                                <div className="btn "></div>
                                <div className="btn active"></div>
                                <div className="btn "></div>
                            </div>
                        </div>
                        <div className="search">
                            <h3 className="title">Don't wait for health. Book online appointments and consult with healthcare experts anytime, anywhere</h3>
                            <div className="search-bar">
                                <input placeholder="Search here..."></input>
                                <div className="search-icon"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div className="function-list">
                    <div className="list">
                        <LargeButton className="function"
                            url = {medicine_chest}
                            width = {100}
                            height = {100}
                        />
                        <LargeButton className="function"
                            url = {stethoscope}
                            width = {100}
                            height = {100}
                        />
                        <LargeButton className="function"
                            url = {temperature}
                            width = {100}
                            height = {100}
                        />
                        <LargeButton className="function"
                            url = {pills}
                            width = {100}
                            height = {100}
                        />
                    </div>    
                    <div className="list">
                        <LargeButton className="function"
                            url = {doctor}
                            width = {100}
                            height = {100}
                        />
                        <LargeButton className="function"
                            url = {hopital}
                            width = {100}
                            height = {100}
                        />
                        <LargeButton className="function"
                            url = {xelan}
                            width = {100}
                            height = {100}
                        />
                        <LargeButton className="function"
                            url = {more}
                            width = {100}
                            height = {100}
                        />
                    </div>    
                </div>
                <div className="key-statics"></div>
                <StandingHospital/>
                <MedicalSpecialist/>
                <LatestnNews/>
                <Question/>
            </div>
        )
    }

}

export default Home;