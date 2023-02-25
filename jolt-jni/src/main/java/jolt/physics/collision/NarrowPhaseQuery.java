package jolt.physics.collision;

import io.github.aecsocket.jniglue.JniBindSelf;
import io.github.aecsocket.jniglue.JniTypeMapping;
import jolt.JoltNative;
import io.github.aecsocket.jniglue.JniInclude;
import jolt.physics.body.BodyFilter;
import jolt.physics.collision.broadphase.BroadPhaseLayerFilter;
import jolt.physics.collision.shape.CastRayCollector;

@JniInclude("<Jolt/Physics/Collision/NarrowPhaseQuery.h>")
@JniTypeMapping("NarrowPhaseQuery")
public class NarrowPhaseQuery extends JoltNative {
    protected NarrowPhaseQuery(long address) { super(address); }
    public static NarrowPhaseQuery ref(long address) { return address == 0 ? null : new NarrowPhaseQuery(address); }

    public boolean getCastRaySp(RayCast3f ray, RayCastResult hit, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter) {
        return _getCastRaySp(
                address,
                ray.origin.x, ray.origin.y, ray.origin.z, ray.direction.x, ray.direction.y, ray.direction.z,
                hit,
                broadPhaseLayerFilter.getAddress(), objectLayerFilter.getAddress(), bodyFilter.getAddress()
        );
    }
    @JniBindSelf("""
            #ifndef JPH_DOUBLE_PRECISION
            RayCast ray;
            ray.mOrigin = Vec3(rayOriginX, rayOriginY, rayOriginZ);
            ray.mDirection = Vec3(rayDirectionX, rayDirectionY, rayDirectionZ);
            RayCastResult cHit;
            bool result = self->CastRay(
                ray,
                cHit,
                *((BroadPhaseLayerFilter*) broadPhaseLayerFilter),
                *((ObjectLayerFilter*) objectLayerFilter),
                *((BodyFilter*) bodyFilter)
            );
            ToJava(env, cHit, hit);
            return result;
            #else
            (void)self;
            JniThrow(env, WRONG_PRECISION);
            return JNI_FALSE;
            #endif""")
    private static native boolean _getCastRaySp(
            long _a,
            float rayOriginX, float rayOriginY, float rayOriginZ, float rayDirectionX, float rayDirectionY, float rayDirectionZ,
            RayCastResult hit,
            long broadPhaseLayerFilter, long objectLayerFilter, long bodyFilter
    );

    public boolean getCastRayDp(RayCast3d ray, RayCastResult hit, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter) {
        return _getCastRayDp(
                address,
                ray.origin.x, ray.origin.y, ray.origin.z, ray.direction.x, ray.direction.y, ray.direction.z,
                hit,
                broadPhaseLayerFilter.getAddress(), objectLayerFilter.getAddress(), bodyFilter.getAddress()
        );
    }
    @JniBindSelf("""
            #ifdef JPH_DOUBLE_PRECISION
            RRayCast ray;
            ray.mOrigin = DVec3(rayOriginX, rayOriginY, rayOriginZ);
            ray.mDirection = Vec3(rayDirectionX, rayDirectionY, rayDirectionZ);
            RayCastResult cHit;
            bool result = self->CastRay(
                ray,
                cHit,
                *((BroadPhaseLayerFilter*) broadPhaseLayerFilter),
                *((ObjectLayerFilter*) objectLayerFilter),
                *((BodyFilter*) bodyFilter)
            );
            ToJava(env, cHit, hit);
            return result;
            #else
            (void)self;
            JniThrow(env, WRONG_PRECISION);
            return JNI_FALSE;
            #endif""")
    private static native boolean _getCastRayDp(
            long _a,
            double rayOriginX, double rayOriginY, double rayOriginZ, float rayDirectionX, float rayDirectionY, float rayDirectionZ,
            RayCastResult hit,
            long broadPhaseLayerFilter, long objectLayerFilter, long bodyFilter
    );

    public void collectCastRaySp(RayCast3f ray, RayCastSettings settings, CastRayCollector collector, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
        _collectCastRaySp(
                address,
                ray.origin.x, ray.origin.y, ray.origin.z, ray.direction.x, ray.direction.y, ray.direction.z,
                settings.backFaceMode().ordinal(), settings.treatConvexAsSolid(),
                collector.getAddress(), broadPhaseLayerFilter.getAddress(), objectLayerFilter.getAddress(), bodyFilter.getAddress(), shapeFilter.getAddress()
        );
    }
    @JniBindSelf("""
            #ifndef JPH_DOUBLE_PRECISION
            RayCast ray;
            ray.mOrigin = Vec3(rayOriginX, rayOriginY, rayOriginZ);
            ray.mDirection = Vec3(rayDirectionX, rayDirectionY, rayDirectionZ);
            RayCastSettings settings;
            settings.mBackFaceMode = (EBackFaceMode) settingsBackFaceMode;
            settings.mTreatConvexAsSolid = settingsTreatConvexAsSolid;
            self->CastRay(
                ray,
                settings,
                *((CastRayCollector*) collector),
                *((BroadPhaseLayerFilter*) broadPhaseLayerFilter),
                *((ObjectLayerFilter*) objectLayerFilter),
                *((BodyFilter*) bodyFilter),
                *((ShapeFilter*) shapeFilter)
            );
            #else
            (void)self;
            JniThrow(env, WRONG_PRECISION);
            #endif""")
    private static native void _collectCastRaySp(
            long _a,
            float rayOriginX, float rayOriginY, float rayOriginZ, float rayDirectionX, float rayDirectionY, float rayDirectionZ,
            int settingsBackFaceMode, boolean settingsTreatConvexAsSolid,
            long collector, long broadPhaseLayerFilter, long objectLayerFilter, long bodyFilter, long shapeFilter
    );

    public void collectCastRayDp(RayCast3d ray, RayCastSettings settings, CastRayCollector collector, BroadPhaseLayerFilter broadPhaseLayerFilter, ObjectLayerFilter objectLayerFilter, BodyFilter bodyFilter, ShapeFilter shapeFilter) {
        _collectCastRayDp(
                address,
                ray.origin.x, ray.origin.y, ray.origin.z, ray.direction.x, ray.direction.y, ray.direction.z,
                settings.backFaceMode().ordinal(), settings.treatConvexAsSolid(),
                collector.getAddress(), broadPhaseLayerFilter.getAddress(), objectLayerFilter.getAddress(), bodyFilter.getAddress(), shapeFilter.getAddress()
        );
    }
    @JniBindSelf("""
            #ifdef JPH_DOUBLE_PRECISION
            RRayCast ray;
            ray.mOrigin = DVec3(rayOriginX, rayOriginY, rayOriginZ);
            ray.mDirection = Vec3(rayDirectionX, rayDirectionY, rayDirectionZ);
            RayCastSettings settings;
            settings.mBackFaceMode = (EBackFaceMode) settingsBackFaceMode;
            settings.mTreatConvexAsSolid = settingsTreatConvexAsSolid;
            self->CastRay(
                ray,
                settings,
                *((CastRayCollector*) collector),
                *((BroadPhaseLayerFilter*) broadPhaseLayerFilter),
                *((ObjectLayerFilter*) objectLayerFilter),
                *((BodyFilter*) bodyFilter),
                *((ShapeFilter*) shapeFilter)
            );
            #else
            (void)self;
            JniThrow(env, WRONG_PRECISION);
            #endif""")
    private static native void _collectCastRayDp(
            long _a,
            double rayOriginX, double rayOriginY, double rayOriginZ, float rayDirectionX, float rayDirectionY, float rayDirectionZ,
            int settingsBackFaceMode, boolean settingsTreatConvexAsSolid,
            long collector, long broadPhaseLayerFilter, long objectLayerFilter, long bodyFilter, long shapeFilter
    );
}

