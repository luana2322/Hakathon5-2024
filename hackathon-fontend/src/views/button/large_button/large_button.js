import React from "react";
import './button.scss';

class LargeButton extends React.Component{

    render(){
        return(
            <div className="around-icon" style={{  width:`${this.props.width}px`, height:`${this.props.height}px`}}>
                <div className="function-icon" style={{ backgroundImage: `url(${this.props.url})`}}></div>
            </div>
        )
    }

}

export default LargeButton


