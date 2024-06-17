package application.repository;

import org.springframework.data.repository.CrudRepository;

public interface JogoRepository extends CrudRepository<Jogo, Long> {
    
    public Iterable<Jogo> findByTitulo(String titulo);
}
