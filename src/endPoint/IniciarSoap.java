package endPoint;

import javax.xml.ws.Endpoint;

import servico.AgendaImp;

public class IniciarSoap {

	public static void main(String[] args) {
		Endpoint.publish(
						"http://localhost:9090/ExercicioSOAP/Agenda",
						new AgendaImp());

		System.out.println("FInd");
	
	}
	

}
