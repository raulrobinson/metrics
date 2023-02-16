package co.com.telefonica.metrics.controller;

import co.com.telefonica.metrics.domain.Player;
import co.com.telefonica.metrics.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerRestController {
	
	@Autowired
	private PlayerRepository repository;
	
	@GetMapping
	private List<Player> getPlayers() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	private List<Player> getById(@PathVariable Integer id) {
		return repository.findById(id);
	}
}
