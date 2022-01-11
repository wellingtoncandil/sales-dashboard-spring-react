import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
        <NavBar/>
        <div>
           <div className="container">
               <div className="jumbotron">
                   <h1 className="display-4"> WCVendas</h1>
                   <p className="lead">Analise o desempenho das vendas por diferentes perspectivas</p>
                   <hr />
                   <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construido com Spring Boot.</p>
                   <Link className="btn btn-primary brn-lg altera-fonte-btn"to="/dashboard">
                       Acessar dashboard
                   </Link>
               </div>
           </div>
        </div>
        <Footer/>
        </>
    );
}

export default Home;