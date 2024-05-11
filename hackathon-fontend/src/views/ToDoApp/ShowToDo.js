import React from "react";

class ShowToDo extends React.Component{

    state = {
        editToDo: {},
        checkToDo: false
    }

    handleDeleleToDo = (toDo) => {
        this.props.deleteToDo(toDo)
    }

    handleUpdateToDo = (toDo) => {
        
        let check = Object.keys(toDo).length !== 0

        if(check === true ){
            this.setState({
                editToDo: toDo,
                checkToDo: check
            })
        }

    }

    render(){

        let listToDo = this.props.listToDo

        return (
            <>
                <div className='list-todo'>
                    {listToDo && listToDo.length>0 && listToDo.map( (item,index) => {
                        return (
                            <div key={item.id}>
                                <hr/>
                                    <div className='todo'>
                                        {this.checkToDo === true && this.state.editToDo.id === item.id ?
                                        <span className='title'>{index + 1} <input onChange={(event) => this.handleTitle(event)} value={this.state.editToDo.title} onKeyPress={(event) => this.handleKeyPress(event)}/></span>
                                        :
                                        <span className='title'>{index + 1}: {item.title} </span>
                                        }
                                        <div className='btn'>
                                            <button onClick={() => this.handleUpdateToDo(item)}>Edit</button>
                                            <button onClick={() => this.handleDeleleToDo(item)}>Delete</button>
                                        </div>
                                    </div>
                                <hr/>
                            </div>
                        )
                    })}
                </div>
            </>
        )
    }
}

export default ShowToDo