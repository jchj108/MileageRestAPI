package com.triple.mileage.api.dto;

import com.triple.mileage.api.domain.Place;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

public class PlaceDto {

    @Data
    public static class PlaceRequest {
        private UUID placeId;

        public Place toEntity() {
            return Place.builder()
                    .id(placeId)
                    .build();
        }
    }

    @Getter
    public static class Res {
        private UUID placeId;
        private long reviewCount;

        public Res(Place place) {
            this.placeId = place.getId();
            this.reviewCount = place.getReviewCount();
        }
    }

}
