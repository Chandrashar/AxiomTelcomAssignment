package com.chan.axiom;

import com.chan.axiom.model.Device;
import com.chan.axiom.repository.DeviceRepository;
import com.chan.axiom.service.DeviceService;
import lombok.Builder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * User: Chandra P Sharma
 * Project: AxiomTelcomAssignment
 * Package: com.chan.axiom
 */

@SpringBootTest
public class DeviceServiceTest {

    private DeviceService deviceService;
    private DeviceRepository deviceRepository = mock(DeviceRepository.class);

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.deviceService = new DeviceService(deviceRepository);
    }

    @Test(expected = EntityNotFoundException.class)
    public void get_should_throw_EntityNotFoundException() throws EntityNotFoundException {
        // Given

        // When
        deviceService.getAllMobile(

        );

        // Then
        fail();
    }

    @Test
    public void get_should_return_the_entity() {
        // Given
        OngoingStubbing<Iterable<Device>> when = when(deviceRepository.findAll());

        // When
        List<Device> foundDevice = deviceService.getAllMobile();

        // Then
        assertEquals(105, foundDevice.size());

}
}
