package ir.mohammadi.service.Admin;

import ir.mohammadi.entity.Expert;
import ir.mohammadi.entity.ExpertService;
import ir.mohammadi.entity.Service;
import ir.mohammadi.entity.enums.ExpertStatus;
import ir.mohammadi.service.ExpertService.ExpertServiceServ;
import ir.mohammadi.util.Hibernate;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface AdminServ {
    void AddMainService(String name);
    void AddSubService(String name, Long basePrice, String description, Service service);
    void AddExpertToSubService(Service service, Expert expert);
    void deleteExpertFromSubService(Service service, Expert expert);
    void ActiveExpert(Expert expert);
    void EditSubServicePrice(Long BasePrice, Service service);
    void EditSubServiceDescription(String description, Service service );
    void EditSubServiceFull(String description, Service service, Long basePrice);
    List<Service> ShowAllMainService();
    List<Service> ShowAllSubService(Service service);
    public void ChangeStatusExpert(Expert expert, ExpertStatus expertStatus);

}
