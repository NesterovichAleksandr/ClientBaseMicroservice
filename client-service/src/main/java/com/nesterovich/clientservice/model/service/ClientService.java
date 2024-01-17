package com.nesterovich.clientservice.model.service;

import com.nesterovich.clientservice.model.entity.Client;
import com.nesterovich.clientservice.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long clientId) {
        return clientRepository.findById(clientId).orElse(null);
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Long clientId, Client updatedClient) {
        // Проверка наличия клиента с заданным ID
        if (clientRepository.existsById(clientId)) {
            // Обновление данных клиента
            updatedClient.setId(clientId);
            return clientRepository.save(updatedClient);
        } else {
            // Вернуть null, если клиент не найден
            return null;
        }
    }

    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}
