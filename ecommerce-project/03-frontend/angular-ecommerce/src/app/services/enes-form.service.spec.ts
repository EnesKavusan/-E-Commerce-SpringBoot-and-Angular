import { TestBed } from '@angular/core/testing';

import { EnesFormService } from './enes-form.service';

describe('EnesFormService', () => {
  let service: EnesFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EnesFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
