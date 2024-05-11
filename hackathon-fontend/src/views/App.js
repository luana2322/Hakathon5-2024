import "./App.scss";
import Components from "./Example/Components.js";
import ListoDos from "./ToDoApp/ListToDos.js";
import { ToastContainer} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Header from "./Header/header.js";
import Home from "./User/home.js";
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import ListUser from "./Users/ListUser.js";
import DetailUser from "./Users/DetailUser.js";
import Footer from "./Footer/footer.js";
import Search from "./SearchDoctorHospital/search.js";

function App() {

  return (
    <BrowserRouter>
    <div className="App">
      <Header/>
      <header className="App-header">
        <Routes>
          <Route path="/" element={<Home/>}/> 
          <Route path="/todo" element={<Search/>}/> 
          <Route path="/about" element={<Components/>}/>
          <Route path="/users" element={<ListUser/>}/> 
          <Route path="/users/:id" element={<DetailUser/>}/> 
        </Routes>
      </header>
      <Footer/>
      <ToastContainer
        position="top-right"
        autoClose={5000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
        theme="dark"
        // transition: Bounce
      />
    </div>
    </BrowserRouter>
  );
}


export default App;
