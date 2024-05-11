import React from "react";
import {toast } from 'react-toastify';

class AddToDo extends React.Component{

    state = {
        title: ''
    }

    handleTitle = (event) => {
        this.setState({
            title: event.target.value
        })
    }

    handleSubmit = () => {

        if(!this.state.title){
            toast.error('Todo không được trống!')
            return
        }
        
        let toDo = {
            id: Math.floor(Math.random() * 10000),
            title: this.state.title
        }

        this.setState({
            title:''
        })

        this.props.addToDo(toDo)
        
    }

    handleKeyPress = (event) => {
        if(event.key === 'Enter'){
            this.handleSubmit()
            return
        }
    }

    render(){
        return(
            <>
                <div className='add-todo'>
                    <input placeholder='To do thing...' className='input-todo' onChange={(event) => this.handleTitle(event)} value={this.state.title} onKeyPress={(event) => this.handleKeyPress(event)}/>
                    <input type='submit' value='ADD' className='btn-submit' onClick={() => this.handleSubmit()}/>
                </div>
            </>
        )
    }
}

export default AddToDo