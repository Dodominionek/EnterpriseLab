/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package req.backing;

import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.inject.Inject;
import javax.validation.constraints.Size;
import req.entities.Request;
import req.facade.RequestFacadeLocal;

/**
 *
 * @author dt532
 */
@Named(value = "requestsList")
@RequestScoped
public class RequestsList {
    @Inject
    private RequestFacadeLocal requestFacade;
    
    @Size(min = 3, max=60, message = "{request.size}")
    private String newRequest;
    private HtmlDataTable requestsDataTable;
    
    public List<Request> getAllRequests(){
        return getRequestFacade().findAll();
    }

    /**
     * Creates a new instance of RequestsList
     */
    public RequestsList() {
    }

    /**
     * Get the value of newRequest
     *
     * @return the value of newRequest
     */
    public String getNewRequest() {
        return newRequest;
    }

    /**
     * Set the value of newRequest
     *
     * @param newRequest new value of newRequest
     */
    public void setNewRequest(String newRequest) {
        this.newRequest = newRequest;
    }

    /**
     * Get the value of requestDataTable
     *
     * @return the value of requestsDataTable
     */
    public HtmlDataTable getRequestsDataTable() {
        return requestsDataTable;
    }

    /**
     * Set the value of requestDataTable
     *
     * @param requestsDataTable new value of requestDataTable
     */
    public void setRequestsDataTable(HtmlDataTable requestsDataTable) {
        this.requestsDataTable = requestsDataTable;
    }
    
    public String addRequest() {
        Request request = new Request();
        request.setRequestText(getNewRequest());
        request.setRequestDate(LocalDate.now());
        getRequestFacade().create(request);
        setNewRequest("");
        return null;
    }
    
    public String deleteRequest() {
        Request req = (Request) getRequestsDataTable().getRowData();
        requestFacade.remove(req);
        return null;
    }

    /**
     * @return the requestFacade
     */
    public RequestFacadeLocal getRequestFacade() {
        return requestFacade;
    }

    /**
     * @param requestFacade the requestFacade to set
     */
    public void setRequestFacade(RequestFacadeLocal requestFacade) {
        this.requestFacade = requestFacade;
    }

    
}
