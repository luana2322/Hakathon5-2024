import React from "react";
import './latest_news.scss';

class News extends React.Component{

    render(){
        return(
            <div className="news">
                <div className="img" style={{ backgroundImage: `url(${this.props.url})`}}></div>
                <div className="date">
                    <p className="type">{this.props.type}</p>
                    <div className="vertical-line"></div>
                    <p className="time">{this.props.time}</p>
                </div>
                <h3 className="information">{this.props.information}</h3>
                <div className="author">
                    <div className="author-img"></div>
                    <p>{this.props.author}</p>
                </div>
            </div>
        )
    }

}

export default News


