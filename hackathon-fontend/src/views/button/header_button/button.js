import React from "react";
import './button.scss';

class HeaderButton extends React.Component{

    render(){
        return(
            <div className="icon" style={{ backgroundImage: `url(${this.props.url})`, width:`${this.props.width}px`, height:`${this.props.height}px`}}></div>
        )
    }

}

export default HeaderButton


