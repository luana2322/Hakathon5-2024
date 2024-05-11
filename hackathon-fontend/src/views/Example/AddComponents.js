import React from "react";

class AddComponents extends React.Component{

    state = {
        titleJob: '',
        salary: '',
    }

    handleTitleJob = (event) => {
        this.setState({
            titleJob: event.target.value
        })
    }

    handleSalary = (event) => {
        this.setState({
            salary: event.target.value
        })
    }

    handleSubmit = (event) => {
        event.preventDefault()

        if(!this.state.titleJob && !this.state.salary){
            alert("Vui lòng check giá trị")
            return;
        }
        let job = {
            id: "job "+ Math.floor((Math.random()*10000)),
            titleJob: this.state.titleJob,
            salary: this.state.salary
        }

        this.props.addJob(job);

        this.setState({
            titleJob: '',
            salary: '',
        })
    }

    render(){
        return (
            <>
            <form>
                <input type='text' placeholder='Title Job' value={this.state.titleJob} onChange={(event) => this.handleTitleJob(event)} /><br/>
                <input type='text' placeholder='Salary' value={this.state.salary} onChange={(event) => this.handleSalary(event)} /><br/>
                <input type='submit' value='Submit' onClick={ (event) => this.handleSubmit(event)} />
            </form>
            </>
        );
    }

}

export default AddComponents;