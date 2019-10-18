package br.com.samy.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.samy.helpdesk.entity.ChangesStatus;

public interface ChancesStatusRepo extends MongoRepository<ChangesStatus, String>{

	
	Iterable<ChangesStatus> findByTicketIdOrderByDateChangesDesc(String ticketId);

}
