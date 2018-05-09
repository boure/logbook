package org.zalando.logbook;

import org.apiguardian.api.API;

import java.time.Duration;

import static org.apiguardian.api.API.Status.STABLE;

@API(status = STABLE)
public interface Correlation<Request, Response> extends Precorrelation<Request> {

    Duration getDuration();

    Response getResponse();

    HttpResponse getOriginalResponse();

}
