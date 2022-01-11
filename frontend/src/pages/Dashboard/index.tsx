import BarChart from "components/BarCharts";
import Datatable from "components/Datatable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <div>
            <>
                <NavBar />
                <div className="container">
                    <div className="row px-3">
                        <div className="col-sm-6">
                            <h3 className="text-center text-secondary">Taxa de conversão (%)</h3>
                            <BarChart />
                        </div>
                        <div className="col-sm-6">
                            <h3 className="text-center text-secondary">Taxa de conversão (%)</h3>
                            <DonutChart />
                        </div>
                    </div>
                    <div className="py-3">
                        <h2 className="text-primary">All Sales</h2>
                    </div>
                    <Datatable />
                </div>
                <Footer />
            </>
        </div>
    );
}

export default Dashboard;