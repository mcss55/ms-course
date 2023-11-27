package com.mcss.mscourse;

import com.mcss.grpc.lib.UserReadRequest;
import com.mcss.grpc.lib.UserReadResponse;
import com.mcss.grpc.lib.UserReadServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class CourseUserReadService {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
            .usePlaintext()
            .build();

    UserReadServiceGrpc.UserReadServiceBlockingStub stub = UserReadServiceGrpc.newBlockingStub(channel);

    public UserReadResponseDTO readUser(String id) {
        UserReadRequest request = UserReadRequest.newBuilder()
                .setId(id)
                .build();
        try {
            UserReadResponse userReadResponse = stub.readUser(request);
            return UserReadResponseDTO.builder()
                    .id(userReadResponse.getId())
                    .name(userReadResponse.getName())
                    .email(userReadResponse.getEmail())
                    .password(userReadResponse.getPassword())
                    .courses(userReadResponse.getCoursesList())
                    .build();
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
            return null; // or handle the error appropriately
        }
    }

}
