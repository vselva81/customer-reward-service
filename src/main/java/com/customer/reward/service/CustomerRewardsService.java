package com.customer.reward.service;

import com.customer.reward.domain.Reward;

public interface CustomerRewardsService {
    public Reward getRewardsByCustomerId(Long customerId);

}
