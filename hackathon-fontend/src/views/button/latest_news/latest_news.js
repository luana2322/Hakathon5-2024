import React from "react";
import './latest_news.scss';
import News from "./news";
import latestnews from "../../../assets/images/lastestnews.png"

class LatestnNews extends React.Component{

    render(){
        return(
            <div className="latest-news">
                <p>Blog & News</p>
                <h1>Read Our Latest News</h1>
                <div className="slider-latest-news">
                    <News
                    url = {latestnews}
                    type = {"Medical"}
                    time =  {"March 31, 2022"}
                    information = {"6 Tips To Protect Your Mental Health When You’re Sick"}
                    author = {"Rebecca Lee"}
                    />
                    <News
                    url = {latestnews}
                    type = {"Medical"}
                    time =  {"March 31, 2022"}
                    information = {"6 Tips To Protect Your Mental Health When You’re Sick"}
                    author = {"Rebecca Lee"}
                    />
                    <News
                    url = {latestnews}
                    type = {"Medical"}
                    time =  {"March 31, 2022"}
                    information = {"6 Tips To Protect Your Mental Health When You’re Sick"}
                    author = {"Rebecca Lee"}
                    />
                </div>
            </div>
        )
    }

}

export default LatestnNews


