
import Chart from 'react-apexcharts';

const BarChart = () => {

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories:['Anakin', 'Barry', 'Elias', 'Logan', 'Cazé']
        },
        series:[
            {
                name: "% Sucesso",
                data: [43.6, 67.2, 25.8, 55.9, 71.4]
            }
        ]
    }


    return (
        <Chart
          options={{...options, xaxis: mockData.labels}}
          series={mockData.series}
          type='bar'
          height={240}
        />
    );
}

export default BarChart;