package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.Solicitacao;
import com.example.fretesmartofi.model.StatusSolicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
    List<Solicitacao> findByClienteId(Long cliente_id);

    @Query("SELECT SUM(f.valorViagem) FROM Solicitacao f WHERE f.dataPartida >= :startDate AND f.dataPartida <= :endDate AND f.status = :status")
    Double obterFaturamentoUltimoMes(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate, @Param("status") StatusSolicitacao status);

    @Query("SELECT SUM(s.valorViagem) FROM Solicitacao s WHERE s.status = :status")
    Double sumValorByStatus(@Param("status") StatusSolicitacao status);
}

