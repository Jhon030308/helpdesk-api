package helpdesk_api.controller;

import helpdesk_api.model.Ticket;
import helpdesk_api.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
@Autowired
private TicketRepository repository;

@GetMapping
    public List<Ticket> listartodos() {
    return repository.findAll();
}
@PostMapping
   public Ticket criar(@RequestBody Ticket ticket) {
    return repository.save(ticket);
}
}