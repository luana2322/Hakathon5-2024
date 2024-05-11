import React from "react";
import './search.scss';
import { redirect } from 'react-router-dom';
import StandingHospital from "../button/standing_hospital/standing_hospital";
import MedicalSpecialist from "../button/medical_specialist/medical_specialist";
import LatestnNews from "../button/latest_news/latest_news";
import Question from "../button/question/question";

class Search extends React.Component{
    render(){
        return (
            <div className="home">
                <div className="search">
                    <div className="left">
                        <div className="top">
                            <div className="search-bar">
                                <input placeholder="Search..."></input>
                                <div className="search-icon"></div>
                            </div>
                            <div className="search-list">
                                Health facilities
                                <div className="drop-icon"></div>
                            </div>
                            <div className="search-map"></div>
                        </div>
                        <div className="content">

                        </div>
                    </div>
                    <div className="right">
                        <div className="top">
                           <div className="search-bar">
                                <input placeholder="Search doctor..."></input>
                                <div className="search-icon"></div>
                            </div>
                            <div className="search-list">
                                <div className="academic">
                                    Academic title
                                    <div className="drop-icon"></div>
                                </div>
                                <div className="gender">
                                    Gender
                                    <div className="drop-icon"></div>
                                </div>
                            </div>
                            <div className="search-department">
                                Department
                                <div className="drop-icon"></div>
                            </div>
                        </div>
                        <div className="content">

                        </div>
                    </div>
                </div>
                <MedicalSpecialist/>
                <StandingHospital/>
                <LatestnNews/>
                <Question/>
            </div>
        )
    }

}

export default Search;