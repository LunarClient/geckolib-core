/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib3.core.event;

import com.eliotlash.molang.variables.ExecutionContext;
import software.bernie.geckolib3.core.controller.AnimationController;

public abstract class KeyframeEvent<T> {
    private final T entity;
    private final double animationTick;
    private final AnimationController controller;
    private final ExecutionContext context;

    /**
     * This stores all the fields that are needed in the AnimationTestEvent
     *
     * @param entity        the entity
     * @param animationTick The amount of ticks that have passed in either the current transition or animation, depending on the controller's AnimationState.
     * @param controller    the controller
     * @param context
     */
    public KeyframeEvent(T entity, double animationTick, AnimationController controller, ExecutionContext context) {
        this.entity = entity;
        this.animationTick = animationTick;
        this.controller = controller;
        this.context = context;
    }

    /**
     * Gets the amount of ticks that have passed in either the current transition or animation, depending on the controller's AnimationState.
     *
     * @return the animation tick
     */
    public double getAnimationTick() {
        return animationTick;
    }

    public T getEntity() {
        return entity;
    }

    public AnimationController getController() {
        return controller;
    }

    public ExecutionContext getExecutionContext() {
        return context;
    }
}
