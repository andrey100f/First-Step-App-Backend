package com.fsa.firststepapp.controller;

import com.fsa.firststepapp.models.dto.*;
import com.fsa.firststepapp.models.request.*;
import com.fsa.firststepapp.models.response.DeleteResponse;
import com.fsa.firststepapp.service.announcement_service.IAnnouncementService;
import com.fsa.firststepapp.service.event_service.IEventService;
import com.fsa.firststepapp.service.faculty_service.IFacultyService;
import com.fsa.firststepapp.service.location_service.ILocationService;
import com.fsa.firststepapp.service.university_service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:5173", allowedHeaders = "*")
@RequestMapping("/api/admin")
public class AdminController {
    private final IAnnouncementService announcementService;
    private final IUniversityService universityService;
    private final ILocationService locationService;
    private final IEventService eventService;
    private final IFacultyService facultyService;

    @Autowired
    public AdminController(IAnnouncementService announcementService, IUniversityService universityService,
                           ILocationService locationService, IEventService eventService, IFacultyService facultyService) {
        this.announcementService = announcementService;
        this.universityService = universityService;
        this.locationService = locationService;
        this.eventService = eventService;
        this.facultyService = facultyService;
    }

    @GetMapping("/announcements")
    public List<AnnouncementDto> getAllAnnouncements() {
        return announcementService.getAllAnnouncements();
    }

    @PostMapping("/announcements")
    public AnnouncementDto addAnnouncement(@RequestBody AddAnnouncementRequest addAnnouncementRequest) {
        return announcementService.addAnnouncement(addAnnouncementRequest);
    }

    @PutMapping("/announcements/{announcementId}")
    public AnnouncementDto updateAnnouncement(@PathVariable String announcementId,
                                              @RequestBody AddAnnouncementRequest addAnnouncementRequest) {
        return announcementService.updateAnnouncement(announcementId, addAnnouncementRequest);
    }

    @DeleteMapping("/announcements/{announcementId}")
    public DeleteResponse deleteAnnouncement(@PathVariable String announcementId) {
        announcementService.deleteAnnouncement(announcementId);
        return new DeleteResponse("Announcement deleted successfully !");
    }

    @GetMapping("/universities")
    public List<UniversityDto> getAllUniversities() {
        return universityService.getAllUniversities();
    }

    @PostMapping("/universities")
    public UniversityDto addUniversity(@RequestBody AddUniversityRequest addUniversityRequest) {
        return universityService.addUniversity(addUniversityRequest);
    }

    @PutMapping("/universities/{universityId}")
    public UniversityDto updateUniversity(@PathVariable String universityId,
                                          @RequestBody AddUniversityRequest addUniversityRequest) {
        return universityService.updateUniversity(universityId, addUniversityRequest);
    }

    @DeleteMapping("/universities/{universityId}")
    public DeleteResponse deleteUniversity(@PathVariable String universityId) {
        universityService.deleteUniversity(universityId);

        return new DeleteResponse("University deleted successfully !");
    }

    @GetMapping("/locations")
    public List<LocationDto> getAllLocations() {
        return locationService.getAllLocations();
    }

    @PostMapping("/locations")
    public LocationDto addLocation(@RequestBody AddLocationRequest addLocationRequest) {
        return locationService.addLocation(addLocationRequest);
    }

    @PutMapping("/locations/{locationId}")
    public LocationDto updateLocation(@PathVariable String locationId,
                                          @RequestBody AddLocationRequest addLocationRequest) {
        return locationService.updateLocation(addLocationRequest, locationId);
    }

    @DeleteMapping("/locations/{locationId}")
    public DeleteResponse deleteLocation(@PathVariable String locationId) {
        locationService.deleteLocation(locationId);

        return new DeleteResponse("Location deleted successfully !");
    }

    @GetMapping("/events")
    public List<EventDto> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/events")
    public EventDto addEvent(@RequestBody AddEventRequest addEventRequest) {
        return eventService.addEvent(addEventRequest);
    }

    @PutMapping("/events/{eventId}")
    public EventDto updateEvent(@PathVariable String eventId, @RequestBody AddEventRequest addEventRequest) {
        return eventService.updateEvent(eventId, addEventRequest);
    }

    @DeleteMapping("/events/{eventId}")
    public DeleteResponse deleteEvent(@PathVariable String eventId) {
        eventService.deleteEvent(eventId);

        return new DeleteResponse("Event deleted successfully !");
    }

    @GetMapping("/faculties")
    public List<FacultyDto> getAllFaculties() {
        return facultyService.getAllFaculties();
    }

    @PostMapping("/faculties")
    public FacultyDto addFaculty(@RequestBody AddFacultyRequest addFacultyRequest) {
        return facultyService.addFaculty(addFacultyRequest);
    }

    @PutMapping("/faculties/{facultyId}")
    public FacultyDto updateFaculty(@PathVariable String facultyId, @RequestBody AddFacultyRequest addFacultyRequest) {
        return facultyService.updateFaculty(facultyId, addFacultyRequest);
    }

    @DeleteMapping("/faculties/{facultyId}")
    public DeleteResponse deleteFaculty(@PathVariable String facultyId) {
        facultyService.deleteFaculty(facultyId);

        return new DeleteResponse("Faculty deleted successfully !");
    }
}
